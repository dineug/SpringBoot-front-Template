import React, { Component } from 'react';
import ReactDOM from 'react-dom';

// 컨텐츠 해더
class ContentHeader extends Component {
    render() {
        return (
            <div>
                <h1>
                    {this.props.children} <small>{this.props.sub}</small>
                </h1>
            </div>
        );
    }
}

export default ContentHeader;