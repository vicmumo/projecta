package ke.co.tamarix.portlet;

import ke.co.tamarix.constants.ReinstatePortletKeys;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
//import com.liferay.portal.kernel.log.LogFactory;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

//import com.liferay.portal.kernel.util.GetterUtil;

import ke.co.tamarix.service.ReinstatementLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import ke.co.tamarix.model.Reinstatement;

/**
 * @author ochieng
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=reinstatement",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Reinstate",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ReinstatePortletKeys.REINSTATE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ReinstatePortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
    CounterLocalService counterLocalService;
	
	@Reference
	ReinstatementLocalService reinstatementLocalService;
	
	//Show Records
	@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
			// TODO Auto-generated method stub
		List<Reinstatement> reinstatementList = reinstatementLocalService.getReinstatements(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("reinstatementList", reinstatementList);
			super.render(renderRequest, renderResponse);
		}
	
	
	//Add
	@ProcessAction(name = "addReinstatement")
    public void addReinstatement(ActionRequest actionRequest,ActionResponse actionResponse) {
        long reinstatementId = counterLocalService.increment(Reinstatement.class.getName());
        String firstName = ParamUtil.getString(actionRequest, "firstName");
        String lastName = ParamUtil.getString(actionRequest, "lastName");
        String branchName = ParamUtil.getString(actionRequest, "branchName");
        String payrollNo = ParamUtil.getString(actionRequest, "payrollNo");
        String terminationReason = ParamUtil.getString(actionRequest, "terminationReason");
        String terminationCode = ParamUtil.getString(actionRequest, "terminationCode");
        String formerBranch = ParamUtil.getString(actionRequest, "formerBranch");
        
        Reinstatement reinstatement = reinstatementLocalService.createReinstatement(reinstatementId);
        reinstatement.setReinstatementId(reinstatementId);
        reinstatement.setFirstName(firstName);
        reinstatement.setLastName(lastName);
        reinstatement.setBranchName(branchName);
        reinstatement.setPayrollNo(payrollNo);        
        reinstatement.setTerminationReason(terminationReason);
        reinstatement.setTerminationCode(terminationCode);
        reinstatement.setFormerBranch(formerBranch);
        
        reinstatementLocalService.addReinstatement(reinstatement);
    }
	
	//update 
	@ProcessAction(name = "updateReinstatement")
    public void updateReinstatement(ActionRequest actionRequest,  ActionResponse actionResponse) {
        long reinstatementId = ParamUtil.getLong(actionRequest,"reinstatementId", GetterUtil.DEFAULT_LONG);
        String firstName = ParamUtil.getString(actionRequest, "firstName", GetterUtil.DEFAULT_STRING);
        String lastName = ParamUtil.getString(actionRequest, "lastName", GetterUtil.DEFAULT_STRING);
        String branchName = ParamUtil.getString(actionRequest, "branchName", GetterUtil.DEFAULT_STRING);
        String payrollNo = ParamUtil.getString(actionRequest, "payrollNo", GetterUtil.DEFAULT_STRING);
        String terminationReason = ParamUtil.getString(actionRequest, "terminationReason", GetterUtil.DEFAULT_STRING);
        String terminationCode = ParamUtil.getString(actionRequest, "terminationCode", GetterUtil.DEFAULT_STRING);
        String formerBranch = ParamUtil.getString(actionRequest, "formerBranch", GetterUtil.DEFAULT_STRING);
        
        
        Reinstatement reinstatement = null;
        try {
            reinstatement = reinstatementLocalService.getReinstatement(reinstatementId);
        } catch (Exception e) {
            log.error(e.getCause(), e);
        }
 
        if(Validator.isNotNull(reinstatement)) {
            reinstatement.setFirstName(firstName);
            reinstatement.setLastName(lastName);
            reinstatement.setBranchName(branchName);
            reinstatement.setPayrollNo(payrollNo);
            reinstatement.setTerminationReason(terminationReason);
            reinstatement.setTerminationCode(terminationCode);
            reinstatement.setFormerBranch(formerBranch);
            
            
            reinstatementLocalService.updateReinstatement(reinstatement);
        }
    }
	
	//Deletehyo 
    @ProcessAction(name = "deleteReinstatement")
    public void deleteReinstatement(ActionRequest actionRequest, ActionResponse actionResponse){
        long reinstatementId = ParamUtil.getLong(actionRequest, "reinstatementId", GetterUtil.DEFAULT_LONG);
        try {
            reinstatementLocalService.deleteReinstatement(reinstatementId);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
	
}