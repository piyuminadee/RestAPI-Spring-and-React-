import { useState, useEffect } from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import api from './api/axiosCOnfig';

import ListEmp from "./component/ListEmp.jsx";

function App() {
    const [employees, setEmployees] = useState([]);

    const getEmployees = async () => {
        try
        {
            const response = await api.get("/api/employees");
            console.log(response.data);
            setEmployees(response.data);

        }
        catch(err) {
            console.log(err);
        }
    }

    useEffect(()=> {
        getEmployees();
    }, [])

  return (
    <>
        <ListEmp employees={employees} />
    </>
  )
}

export default App
