package API;

import java.util.LinkedHashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InsertApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject(); 
		//LinkedHashMap obj=new LinkedHashMap();
		obj.put("userId", "r.g@rebrand.clouzer.com");
		obj.put("action","INSERT");
		JSONArray arr=new JSONArray();
		JSONObject obj2=new JSONObject();
		JSONObject obj10= new JSONObject();
		JSONArray arr2=new JSONArray();
		arr2.add("INSERST_PRODUCT");
		obj2.put("actionarray", arr2);
		JSONArray arr3=new JSONArray();
		JSONObject obj3=new JSONObject();
		obj3.put( "CML_TITLE", "COLOR");
		obj3.put("CML_DESCRIPTION", "ooooo");
		obj3.put("CML_TYPE","abc");
		JSONObject obj4=new JSONObject();
		obj4.put( "CML_TITLE", "SIZE");
		obj4.put("CML_DESCRIPTION", "ooooo");
		obj4.put("CML_TYPE","abc");
		arr3.add(obj3);
		arr3.add(obj4);
		obj2.put("essentiallist",arr3);
		arr.add(obj2);
		JSONObject obj5=new JSONObject();
		JSONObject obj6=new JSONObject();
		obj6.put("ACTIVE_STATUS", 1);
		obj6.put("invSeries", "SOUL");
		obj6.put("stockMinValue", 13);
		obj6.put("CML_CURRENCY_TYPE", "$");
		obj6.put("CML_TITLE", "messiGOAT10");
		obj6.put("CML_REF_ID", "r.g@rebrand.com#PRJ_URM_0002#SEC_REPL_WTZ_0011");
		obj6.put("KEY_TYPE", "TSK");
		obj6.put("CML_SUB_CATEGORY", "rebrand@clouzer.com#PRJ_ORG_WKS_1575713475753_8003");
		obj6.put("SUB_KEY_TYPE", "TSK_PRD_LST");
		obj6.put("SYNC_PENDING_STATUS", 0);
		obj6.put("CML_TEMP_KEY_VAL", "undefined#TSK_PRD_LST#r.g@rebrand.clouzer.com:1577710294529_11397583929_19727");
	obj6.put("DEPT_PROJECT_ID","rebrand.clouzer.com#PRJ_DEPT_ORG_1231231231231_1234");	
	obj6.put("ORG_PROJECT_ID","rebrand.clouzer.com#PRJ_ORG_WKS_1575713475753_8003");
	obj6.put( "USER_LAST_MODIFIED_ON","2019-12-30T12:51:03.460Z");
	obj6.put("CML_DESCRIPTION","3222");
	obj6.put( "CML_ORG_WEB_SITE","rebrand.clouzer.com");
	obj6.put( "PARENT_WIZARD_ID","rebrand.clouzer.com#PRJ_ORG_WKS_1575713475753_8003#SEC_WIZ_PRD_DB_0011");
	JSONArray arr6=new JSONArray();
	obj6.put("CML_IMAGE_PATH",arr6);
	obj6.put("PROJECT_ID","r.g@rebrand.clouzer.com#PRJ_URM_0002");
	obj6.put("CML_COST",32);
	obj6.put( "CML_VISIBILITY",1);
	obj6.put("CML_MANUFACTURER","REBRAND");
	JSONArray arr7=new JSONArray();
	obj6.put("CML_ORG_LOGO",arr7);
	obj6.put( "FIVE_STAR_COUNT",0);
	obj6.put( "FOUR_STAR_COUNT",0);
	obj6.put( "THREE_STAR_COUNT",0);
	obj6.put( "TWO_STAR_COUNT",0);
	obj6.put( "ONE_STAR_COUNT",0);
	obj6.put("CML_RATING_STAR",0);
	obj6.put("CML_REVIEW_COUNT",0);
	obj6.put("CML_RATE_COUNT",0);
	obj6.put("CML_DISCOUNT",0);
	obj6.put(  "CML_DISCOUNT_TYPE","%");
	JSONArray arr9=new JSONArray();
	arr9.add("admin@clouzer.com#PRJ_PS_STU_ORG_4#SEC_PS_STU_ORG_4#TSK_PRD_CAT_1565075080836_8862");
	obj6.put("CML_CATEGORY",arr9);
	obj6.put("CML_QTY",0);
	obj6.put("CML_STOCK_QTY",0);
	obj6.put("CML_STANDARD_TITLE","Product");
	JSONArray arr10=new JSONArray();
	obj6.put("CML_STANDARD",arr10);
	obj6.put("CML_MODEL_NO","21");
	obj6.put("STANDARD_STATUS",2);
	JSONArray arr11=new JSONArray();
	obj6.put("SERVICE_CATEGORY",arr11);
	obj2.put("calmailobject",obj6);
	arr.add(obj2);
		obj.put("dataarray", arr);
		obj.put("modulename","SCM" );
		obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
		obj.put("FROM","senddatatoserver");
		obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
		JSONArray arr12=new JSONArray();
		JSONObject obj9=new JSONObject();
		obj9.put("Location","serverOperation : front_end");
		obj9.put("Timestamp",157770);
		arr12.add(obj9);
		JSONObject obj11=new JSONObject();
		obj11.put("Location","etRouteHandler2Paget_serverOperation : node");
		obj11.put("Timestamp",157770);
		arr.add(obj11);
		JSONObject obj12=new JSONObject();
		obj12.put("Location","etOrgActionCreator_sendtoJava : node");
		obj12.put("Timestamp",157770);
		arr12.add(obj12);
		JSONObject obj13=new JSONObject();
		obj13.put("Location","etDirectToQueue_sendToJavaProcess : node");
		obj13.put("Timestamp",157770);
		arr12.add(obj13);
		JSONObject obj14=new JSONObject();
		obj14.put("Location","etKafka_producer_sendMessage:node");
		obj14.put("Timestamp",157770);
		arr12.add(obj14);
		obj.put("baton",arr12);
		obj.put("topic","CCR_CLZ_COM");
			System.out.println(obj);
		

	}

}
