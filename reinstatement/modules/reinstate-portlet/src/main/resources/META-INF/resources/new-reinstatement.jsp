<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:actionURL name="addReinstatement" var="addReinstatementActionURL"/>
            
                
<h2>Add  addReinstatement Form here !</h2>
 
<aui:form action="<%=addReinstatementActionURL %>" name="reinstatementForm" method="POST">
    <aui:input name="firstName" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input>
    <aui:input name="lastName" >
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
    </aui:input> 
    <aui:input name="branchName" >
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>
    <aui:input name="payrollNo">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>  
    <aui:input name="terminationReason">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input> 
    <aui:input name="terminationCode">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input> 
     <aui:input name="formerBranch">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>  
    <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>