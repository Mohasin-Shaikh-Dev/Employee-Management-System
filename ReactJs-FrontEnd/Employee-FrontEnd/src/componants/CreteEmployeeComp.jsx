import React, { useState } from 'react'
import { createEmployee } from '../Services/EmployeeService'
import { useNavigate } from 'react-router-dom'

const CreteEmployeeComp = () => {
    const [firstName, setFirstName] = useState('')
    const [lastName, setLastName] = useState('')
    const [email, setEmail] = useState('')

    const handlefirstName = (e) => setFirstName(e.target.value)

    const handlelLastName = (e) => setLastName(e.target.value)

    const handleEmail = (e) => setEmail(e.target.value);

    const navigate=useNavigate();

    function saveEmployee(e) {
        e.preventDefault();
        const employee = { firstName, lastName, email }
        console.log(employee)
        createEmployee(employee).then((response) => {
            console.log(response.data);
            navigate('/employees');
        })
    }

    return (
        <div className='container'>
            <br></br>
            <div className='row'>
                <div className='card col-md-6 offset-md-3 offset-md-3'>
                    <h2 className='text-center'>Add Employee</h2>
                    <div className='card-body'>
                        <form action="">
                            <div className='form-group mb-2'>
                                <label className='form-label'>First Name:</label>
                                <input type="text"
                                    placeholder='Enter first Name'
                                    name='firstName'
                                    className='form-control'
                                    value={firstName}
                                    onChange={handlefirstName} />
                            </div>

                            <div className='form-group mb-2'>
                                <label className='form-label'>Last Name:</label>
                                <input type="text"
                                    placeholder='Enter Last Name'
                                    name='LastName'
                                    className='form-control'
                                    value={lastName}
                                    onChange={handlelLastName} />
                            </div>

                            <div className='form-group mb-2'>
                                <label className='form-label'>Email:</label>
                                <input type="email"
                                    placeholder='Enter email-Id'
                                    name='LastName'
                                    className='form-control'
                                    value={email}
                                    onChange={handleEmail} />
                            </div>
                            <div className='mybtn'>
                                <button type="button" className="btn btn-success" onClick={saveEmployee}>Success</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>

        </div>
    )
}

export default CreteEmployeeComp;