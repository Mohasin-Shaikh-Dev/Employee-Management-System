import React,{useEffect, useState} from 'react'
import { listOfEmployee } from '../Services/EmployeeService';
import { useNavigate } from 'react-router-dom';

const ListOfAllEmployees = () => {
    const[employees,setEmployees]=useState([]);
    useEffect(()=>{
            listOfEmployee().then((response)=>{
                setEmployees(response.data);
            }).catch(error =>{
                console.error(error);
            })
    },[])

    const navigate=useNavigate();

    function addNewEmployee()
    {
        navigate("/add-employee");
    }

    return (
        <div className='container'>
            <h2 className='text-center'>List of Employees</h2>
            <button type="button" className="btn btn-primary" onClick={addNewEmployee}>Add Employee</button>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>First_name</th>
                        <th>Last_Name</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        employees.map(employee => (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstName}</td>
                                <td>{employee.lastName}</td>
                                <td>{employee.email}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListOfAllEmployees;