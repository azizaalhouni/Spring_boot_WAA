import React, { useState } from 'react';

import Student from '../../components/Student/student';
import '../Dashboard/Dashboard.css';


const Dashboard = () =>{

    // const students = [
    //     {id:111, name:"Meti",Major:"CS"},
    //     {id:112, name:"Tedros",Major:"CS"},
    //     {id:113,name:"Pascal",Major:"CS"}
    // ]
    const [students, setStudents] = useState(
        [
            {id:111, name:"Meti",Major:"CS"},
            {id:112, name:"Tedros",Major:"CS"},
            {id:113,name:"Pascal",Major:"CS"}
        ]
    );
        
    const [newName, setName] = useState();
    const nameHandler = (newName) =>
    {
        const curStudents = [...students];
        curStudents[0].name = newName;
        setStudents(curStudents);
    }

    const studentList = students.map(s=><Student key={s.id} id={s.id} name={s.name}
        major={s.Major}/>);

        // const [name, setName] = useState(1);
        
    return(
        <React.Fragment>
       <div>
                {studentList}
                </div>
             
       
          <div className="update">
                <label>Name</label>
               
                <input type="text" onChange={event => setName(event.target.value)}></input>
                <button onClick={()=>nameHandler([...newName])}>Update Name</button>
               </div>
                {/* <button onClick={}>Update</button>  */}
            
        </React.Fragment>
    );
}

export default Dashboard;
