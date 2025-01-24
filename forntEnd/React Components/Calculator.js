
import {Component} from 'react';

class Calculator extends Component{

    state = {a:20,b:10,name:'Everyone',showResult:false}

    setA =(e)=>{

       this.setState({a:parseInt(e.target.value),showResult:false});

    };


    setB=(e)=>{

        this.setState({b:parseInt(e.target.value),showResult:false});
    };


    setShowResult=e=>{
        this.setState(previousValue=>{

            return {showResult:!previousValue.showResult};

        })
    }


    render(){
        return(<div>
<center>

               {/* Please mention your name:-<input type="text" onChange={e=>{this.setState({name:e.target.value})}}/>

                <h1>Hello {this.state.name}</h1>
                <br/><br/> */}
                <h1><u>Calculator</u></h1><br/><br/><br/>

                <input type="text"  placeholder='A' name='inputA'  onChange={this.setA} />

                <input type="text" placeholder='B' name='inputB' onChange={this.setB}/>
                <button type="button" onClick={this.setShowResult}>CheckResult</button>

            {this.state.showResult ?(<div>

            <h3>Addition :- {this.state.a+this.state.b}</h3>
            <h3>Subraction:-{this.state.a-this.state.b}</h3>
            <h3>Division:- {this.state.a/this.state.b}</h3>
            <h3>Multiplication:-{this.state.a*this.state.b}</h3>
            </div>):(<div>
                <h1>Please click on the CheckResult button for the result</h1>
            </div>)}



</center>
           

        </div>);
    }
}

export default Calculator;