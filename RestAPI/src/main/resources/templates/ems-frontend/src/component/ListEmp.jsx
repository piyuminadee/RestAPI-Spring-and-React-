import { useState , useEffect } from 'react'
function ListEmp({employees}) {


  return (
      <div className="container">
          <h1 className="text-center">Hello</h1>
          <table >
              <thead>
              <tr>
                  <th >ID</th>
                  <th >First Name</th>
                  <th >
                      Last Name
                  </th>
                  <th >
                      Email
                  </th>

              </tr>
              </thead>
              <tbody>
              {employees.map((employee, _id) => (
                  <tr key={employee._id} >
                      <td>
                          {employee._id}
                      </td>
                      <td>
                          {employee.firstName}
                      </td>
                      <td>
                          {employee.lastName}
                      </td>
                      <td>
                          {employee.email}
                      </td>

                  </tr>
              ))}
              </tbody>
          </table>
      </div>
  )
}

export default ListEmp
