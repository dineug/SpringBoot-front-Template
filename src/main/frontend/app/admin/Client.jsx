import React, { Component } from 'react';
import ReactDOM from 'react-dom';

// client 컨텐츠 내용
class Client extends Component {
    constructor( props ) {
        super( props );
        this.handleClick = this.handleClick.bind( this );
        this.apiTagList = this.apiTagList.bind( this );
        this.handleSuccess = this.handleSuccess.bind( this );
    }
    
    handleClick( e ) {
        let id = $( e.target.parentNode.innerHTML ).attr( 'clientid' );
        let client_id = '';
        let apis = new Array();
        let len = this.props.list.length;
        for ( var i = 0; i < len; i++ ) {
            if ( id === this.props.list[i].id ) {
                apis = this.props.list[i].apiList;
                client_id = this.props.list[i].client_id;
                break;
            }
        }
        this.apiTagList(apis, client_id);
    }
    
    apiTagList(obj, client_id) {
        var tag = new StringBuffer();
        tag.append('<div class="box">');
        tag.append('<div class="box-body table-responsive no-padding">');
        tag.append('<table class="table table-hover">');
        tag.append('<tbody>');
        tag.append('<tr>');
        tag.append('<th>apiTypeCode</th>');
        tag.append('<th>method</th>');
        tag.append('<th>url</th>');
        tag.append('<th>notes</th>');
        tag.append('<th>scope</th>');
        tag.append('</tr>');
        for (var i = 0; i < obj.length; i++) {
            tag.append('<tr>');
            tag.append('<td>'+obj[i].apiTypeCode+'</td>');
            tag.append('<td>'+obj[i].method+'</td>');
            tag.append('<td>'+obj[i].url+'</td>');
            tag.append('<td>'+obj[i].notes+'</td>');
            if(obj[i].scope === 'public') {
                tag.append('<td><input client_id="'+client_id+'" apiTypeCode="'+obj[i].apiTypeCode+'" method="'+obj[i].method+'" url="'+obj[i].url+'" type="checkbox" checked data-toggle="toggle" data-on="public" data-off="private" data-onstyle="success" data-offstyle="danger" data-width="100" /></td>');
            }else if(obj[i].scope === 'private') {
                tag.append('<td><input client_id="'+client_id+'" apiTypeCode="'+obj[i].apiTypeCode+'" method="'+obj[i].method+'" url="'+obj[i].url+'" type="checkbox" data-toggle="toggle" data-on="public" data-off="private" data-onstyle="success" data-offstyle="danger" data-width="100" /></td>');
            }
            tag.append('</tr>');
        }
        tag.append('</tbody>');
        tag.append('</table>');
        tag.append('</div>');
        tag.append('</div>');
        $('#apiList .modal-body').html(tag.toString());
        $('input[type=checkbox][data-toggle^=toggle]').bootstrapToggle();
        var self = this;
        $('#apiList').find('input[type=checkbox]').change(function(e){
            self.api = {
                    client_id: $(this).attr('client_id'),
                    apiTypeCode: $(this).attr('apiTypeCode'),
                    method: $(this).attr('method'),
                    url: $(this).attr('url'),
                    scope: $(this).prop('checked') ? 'public' : 'private'
            };
            $.ajax( {
                url: '/admin/clients/api',
                type: 'put',
                data: self.api,
                success: self.handleSuccess
            } );
        });
        $( '#apiList' ).modal();
    }
    
    handleSuccess(obj) {
        if (obj.check) {
            let apis;
            let client_id = this.api.client_id;
            let len = this.props.list.length;
            for ( var i = 0; i < len; i++ ) {
                if ( client_id === this.props.list[i].client_id ) {
                    apis = this.props.list[i].apiList;
                    break;
                }
            }
            if(apis) {
                len = apis.length;
                for ( var i = 0; i < len; i++ ) {
                    if ( this.api.apiTypeCode === apis[i].apiTypeCode
                            && this.api.method === apis[i].method
                            && this.api.url === apis[i].url) {
                        apis[i].scope = this.api.scope;
                        break;
                    }
                }
            }
        }else {
            alert('변경실패');
        }
    }
    
    render() {
        const elementClients = this.props.list.map( client =>
            <tr key={client.id}>
                <td>{client.client_id}</td>
                <td>{client.id}</td>
                <td><span className="label label-success">{client.scope}</span></td>
                <td><button type="button" className="btn btn-info" clientid={client.id} onClick={this.handleClick}>조회</button></td>
            </tr>
        );
        return (
            <div className="box">
                <div className="box-body table-responsive no-padding">
                    <table className="table table-hover">
                        <tbody>
                            <tr>
                                <th>client_id</th>
                                <th>id</th>
                                <th>scope</th>
                                <th>API</th>
                            </tr>
                            {elementClients}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default Client;