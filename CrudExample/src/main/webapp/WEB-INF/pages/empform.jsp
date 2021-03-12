<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>  
       <form:form  modelAttribute="emp" action="/CrudExample/save">    
        <table >    
         <tr>    
          <td><form:label path="name">Name : </form:label></td>  
          
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td><form:label path="name">Salary : </form:label></td>  
            
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td><form:label path="name">Designation : </form:label></td>   
           
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  