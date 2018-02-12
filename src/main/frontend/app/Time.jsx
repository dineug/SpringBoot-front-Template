import React, { Component } from 'react';
import ReactDOM from 'react-dom';


class Time extends Component {
    constructor( props ) {
        super( props );
        this.state = { date: new Date() };
    }

    componentDidMount() {
        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval( this.timerID );
    }

    tick() {
        this.setState( {
            date: new Date()
        } );
    }

    render() {
        return (
            <div>
                <span>{this.state.date.toLocaleTimeString()}</span>
            </div>
        );
    }
}

export default Time;

