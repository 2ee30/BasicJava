package test.json;

import org.json.JSONObject;

public class MainClass4 {
	public static void main(String[] args) {
		//json 문자열 만들기 
		String json="{\"num\":1,\"name\":\"김구라\",\"isMan\":true}";
		//json 문자열을 이용해서 JSONObject  만들기
		JSONObject jsonObj=new JSONObject(json);
		int num=jsonObj.getInt("num");
		String name=jsonObj.getString("name");
		boolean isMan=jsonObj.getBoolean("isMan");
	}
}






