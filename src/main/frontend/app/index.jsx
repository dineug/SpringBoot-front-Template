import React from 'react';
import ReactDOM from 'react-dom';
import '../style/style.css'

class Tick extends React.Component {
    constructor(props) {
        super(props);
        this.state = {date: new Date()};
      }
    
    componentDidMount() {
        this.timerID = setInterval(
                () => this.tick(),
                1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.timerID);
    }
    
    tick() {
        this.setState({
          date: new Date()
        });
      }
    
    render(){
        return (
          <div>
                <h1>tiem : {this.state.date.toLocaleTimeString()}</h1>
          </div>      
        );
    }
}


ReactDOM.render(<Tick />, document.getElementById('root'));