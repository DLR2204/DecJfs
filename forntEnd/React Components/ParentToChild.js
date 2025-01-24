import { Component } from "react";
import './parent2child.css';

export class ParentToChild extends Component{

    state={empName:'Steve',empId:'100',empSal:'987324',empAdd:'Hyderabad'}

    render(){
        return(<div className="parent">
            <p>Iam from the parent Component</p>

            <Child name={this.state.empName} id={this.state.empId} sal={this.state.empSal} add={this.state.empAdd}/>


            <br/><br/><br/>
        </div>);
    }
}


class Child extends Component{

    render(){
        return(<div className="child">

            <p>Iam from the child component</p>
           
            <b>Employee Name:- {this.props.name}</b><br/>
            <b>Employee Id:- {this.props.id}</b><br/>
            <b>Employee Salary:-{this.props.sal} </b><br/>
            <b>Employee Address:-{this.props.add} </b><br/>
           
        </div>)

}}