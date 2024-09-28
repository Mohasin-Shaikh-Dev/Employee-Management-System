
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import { Footer } from './componants/Footer'
import { Header } from './componants/Header'
import ListOfAllEmployees from './componants/ListOfAllEmployees'
import CreteEmployeeComp from './componants/CreteEmployeeComp'

function App() {
  return (
    <>
      <BrowserRouter>
      <Header /> <br />
       <Routes>
           {/*  http:localhost:5000/add-employee*/}
          <Route path='/add-employee' element={<CreteEmployeeComp/>}/>

          {/*  http:localhost:5000*/}
          <Route path='/' element={<ListOfAllEmployees/>}/>

          {/*  http:localhost:5000/employees*/}
          <Route path='/employees' element={<ListOfAllEmployees/>}/>
        </Routes>
        <Footer />
      </BrowserRouter>
    </>
  )

}

export default App
