package API;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DeleteAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
JSONObject obj=new JSONObject();
obj.put("userId", "r.g@rebrand.clouzer.com");
obj.put("modulename", "SCM");
obj.put("socketId","jo.wood@clouzer.com#socketId#1551438354623#310");
obj.put("requestId","jo.wood@clouzer.com#requestId#1551438354623#3596");
JSONArray arr=new JSONArray();
JSONObject obj2=new JSONObject();
JSONArray arr2=new JSONArray();
arr2.add("DELETE_PRODUCT");
obj2.put("actionarray",arr2);
obj2.put("keyType","TSK");
obj2.put("subKeyType","TSK_PRD_LST");
obj2.put("keyVal","rebrand.clouzer.com#PRJ_DEPT_ORG_1231231231231_1234#SEC_WIZ_PRD_DB_0011#TSK_PRD_LST_1577774826691_49");
obj2.put( "activeStatus",5);
arr.add(obj2);
obj.put("dataarray",arr);
System.out.println(obj);
System.out.println("Enter UserId to delete");
String s=sc.nextLine();
if(s.equals(obj.get("userId")))
{
obj.clear();
}
System.out.println(obj.get("userId"));


	}

}
