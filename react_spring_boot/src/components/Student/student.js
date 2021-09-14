import React from 'react';
import './student.css';

const Student = (props) =>{
    return(
    <div className="Student">
        <h1>Student</h1>
        <p>id:{props.id}</p>
        <p>Name:{props.name}</p>
        <p>Major:{props.major}</p>

    </div>
    

);
}
export default Student;
