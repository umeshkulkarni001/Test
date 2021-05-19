package API;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UpdateAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject(); 
		obj.put("userId", "r.g@rebrand.clouzer.com");
		JSONObject obj2=new JSONObject();
		obj2.put("modulename", "SCM");
		obj2.put("hitserverflag",1);
		obj.put("extraParam",obj2);
		obj.put("action","UPDATE");
		JSONArray arr=new JSONArray();
		JSONObject obj3=new JSONObject();
		JSONArray arr3=new JSONArray();
		arr3.add("UPDATE_PRODUCT");
		obj3.put("actionarray",arr3);
		JSONObject obj4=new JSONObject();
		obj4.put("CML_TITLE","CCR-2");
		JSONArray arr4=new JSONArray();
		obj4.put("CML_IMAGE_PATH",arr4);
		obj4.put("SYNC_PENDING_STATUS",0);
		obj4.put("LAST_MODIFIED_ON","2019-12-31T06:52:36.441Z");
		obj4.put("stockMinValue",36);
		obj3.put("calmailobject",obj4);
		obj3.put("keyType","TSK");
		obj3.put("keyVal","rebrand.clouzer.com#PRJ_DEPT_ORG_1231231231231_1234#SEC_WIZ_PRD_DB_0011#TSK_PRD_LST_1577774826691_49");
		obj3.put("subKeyType","TSK_PRD_LST");
		arr.add(obj3);
		
		obj.put("dataarray",arr);
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
