
import {Component} from 'react';
import Movie from './Movie';
import './movies.css';
import './movielist';
import movielist from './movielist';


class Movies extends Component{

    state={...movielist}

    getMovie=(x)=>{
        return <Movie poster={x.poster} title={x.title} zoner={x.zoner}/>
    }

    render(){
        return(<div className='movies'>
                <div className="row">

           {this.getMovie(this.state.GameChanger)} 

           {this.getMovie(this.state.Maharaj)},

           {this.getMovie(this.state.SkyForce)},
           
           {this.getMovie(this.state.sankranthi)}

           


  
  </div>  </div>);
    }

}

export default Movies;