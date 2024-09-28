import axios from 'axios';   // used to make the http request
const REST_API_BASE_URL='http://localhost:8081/api/employees';
export const listOfEmployee=()=> axios.get(REST_API_BASE_URL);
export const createEmployee=(employee)=> axios.post(REST_API_BASE_URL,employee);

/*
This code is essentially a way to fetch employee data from a server using Axios.
 You call the listOfEmployee function to get that data.
*/