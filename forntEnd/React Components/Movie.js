import './movie.css'

function Moive(props){

    return(
        <div className="movie-card">

            <img src={props.poster}/>
           
           <center><b>{props.title}</b>
            <p>{props.zoner}</p>
           </center> 


        </div>
    );

}

export default Moive;