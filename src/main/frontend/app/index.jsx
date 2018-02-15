import React from 'react';
import ReactDOM from 'react-dom';
import Time from './Time';
import ContentHeader from './ContentHeader';
import Client from './admin/Client';

$( function() {
    ReactDOM.render( <Time />, document.getElementById( 'time' ) );

    if ( hc.domain() === 'admin' ) {

        $( '#sidebarClient' ).click( function( e ) {
            e.preventDefault();
            
            ReactDOM.render( <ContentHeader sub="API authority">Client</ContentHeader>, document.querySelector( '.content-header' ) );
            
            clientAjax();

        } );
        $( '#sidebarClient' ).trigger( 'click' );

        $( '#sidebarUser' ).click( function( e ) {
            e.preventDefault();
            
            ReactDOM.render( <ContentHeader>User</ContentHeader>, document.querySelector( '.content-header' ) );
            
            ReactDOM.render( <div>TEST</div>, document.querySelector( '.container-fluid' ) );
            
        } );


    } else if ( hc.domain() === 'user' ) {



    }

} );

// clientList Ajax
function clientAjax() {
    let query = {};
    $.ajax( {
        url: '/admin/clients',
        type: 'post',
        data: query,
        success: function(obj){
            if ( obj.check ) {
                ReactDOM.render( <Client list={obj.response} />, document.querySelector( '.container-fluid' ) );
            }else {
                if(obj.check === undefined) {
                    location.reload();
                }
            }
        }
    } );
}




