<%@ include file="init.jsp"%>
<%@page import="ke.co.tamarix.model.Reinstatement"%>
<%@page import="java.util.List"%>

<portlet:defineObjects />
 
<%  List<Reinstatement> reinstatementList = (List<Reinstatement>)request.getAttribute("reinstatementList"); %>
<portlet:renderURL var="addReinstatementRenderURL">
    <portlet:param name="mvcPath" value="/new-reinstatement.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addReinstatementRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Reinstatement
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>First Name</th>
        <th>Last Name</th>
        <th>Branch Name</th>
        <th>Payroll No</th>
        <th>Termination Reason</th>
        <th>Termination Code</th>
        <th>Former Branch</th>
        <th colspan="2" style="width: 100px">Action</th>
    </tr>
    <c:forEach items="${reinstatementList}" var="reinstatement">  
    
        <portlet:renderURL var="updateReinstatementRenderURL">
            <portlet:param name="mvcPath" value="/update-student.jsp"/>
            <portlet:param name="enrollmentNo" value="${reinstatement.firstName}"/>
            <portlet:param name="firstName" value="${reinstatement.lastName}"/>
            <portlet:param name="lastName" value="${reinstatement.branchName}"/>
            <portlet:param name="lastName" value="${reinstatement.payrollNo}"/>
            <portlet:param name="contactNo" value="${reinstatement.terminationReason}"/>
            <portlet:param name="city" value="${reinstatement.terminationCode}"/>
            <portlet:param name="city" value="${reinstatement.formerBranch}"/>
            <portlet:param name="studentId" value="${reinstatement.reinstatementId}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteReinstatement" var="deleteReinstatementActionURL">
            <portlet:param name="reinstatementId" value="${reinstatement.getReinstatementId()}"/>
        </portlet:actionURL>
                
        <tr> 
            <td>${reinstatement.getFirstName()}</td>
            <td>${reinstatement.getLastName()}</td>
            <td>${reinstatement.getBranchName()}</td>
            <td>${reinstatement.getPayrollNo()}</td>
            <td>${reinstatement.getTerminationReason()}</td>
            <td>${reinstatement.getTerminationCode()}</td>
            <td>${reinstatement.getFormerBranch()}</td>
            <td class="text-center" style="width: 50px">
                <a href="<%=updateReinstatementRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
                <i class ="glyphicon glyphicon-edit"></i>
                </a>
            </td> 
            <td class="text-center" style="width:50px">
                <a href="<%=deleteReinstatementActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-2 py-1"
                    onclick="return confirm('Are you sure you want to delete this item?');"> 
                    <i class ="glyphicon glyphicon-remove"></i>
                </a>
            </td>                                     
         </tr>
    </c:forEach>
</table>