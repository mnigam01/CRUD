<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form modelAttribute="emp" action="/CrudExample/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" value="${u.id}"/></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  value="${u.name}" /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" value="${u.salary}"/></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" value="${u.designation}"/></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form> 