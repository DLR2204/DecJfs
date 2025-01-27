import { Component } from "react";


export default class ListNkeys extends Component{

    state = {user:[{name:'ramesh',id:'100'},{name:'suresh',id:'200'},{name:'naresh',id:'300'},{name:'mahesh',id:'400'},{name:'rajesh',id:'500'},{name:'somesh',id:'600'}]}

    render(){
        return(<div>
            <h1>Lists Nd Keys in React </h1>

            {this.state.user.map(user=>{
                return <p >{user.id}={user.name}</p>
            })}

        </div>);
    }
    
}