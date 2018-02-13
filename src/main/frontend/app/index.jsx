import React from 'react';
import ReactDOM from 'react-dom';
import Time from './time';
import ContentHeader from './contentHeader';
import Client from './admin/client';

$(function(){
    ReactDOM.render( <Time />, document.getElementById( 'time' ) );
    
    if(hc.domain() === 'admin') {
        
        $('#sidebarClient').click(function(e){
            e.preventDefault();
            ReactDOM.render( <ContentHeader sub="API authority">Client</ContentHeader>, document.querySelector('.content-header') );
            var query = {};
            $.ajax({
                url: '/admin/clients',
                type: 'post',
                data: query,
                success :function(obj){
                    
                }
            });
            
        });
        $('#sidebarClient').trigger('click');
        
        $('#sidebarUser').click(function(e){
            e.preventDefault();
            ReactDOM.render( <ContentHeader>User</ContentHeader>, document.querySelector('.content-header') );
        });
        
        
    }else if(hc.domain() === 'user') {
        
        
        
    }
    
});






