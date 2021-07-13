package pojo;

public class Createissue {
	//for json array use list 
//	for nested json use array list
	private fields fields;
	/*{
   "fields":{
      "project":{
         "id":"10000"
      },
      "summary":"something's wrong",
      "issuetype":{
         "id":"10000"
      },
      "assignee":{
         "name":"homer"
      },
      "reporter":{
         "name":"smithers"
      },
      "priority":{
         "id":"20000"
      },
      "labels":[
         "bugfix",
         "blitz_test"
      ],
      "security":{
         "id":"10000"
      },
      "versions":[
         {
            "id":"10000"
         }
      ],
      "environment":"environment",
      "description":"description",
      "duedate":"2011-03-11"
   }
}*/

	public fields getFields() {
		return fields;
	}

	public void setFields(fields fields) {
		this.fields = fields;
	}
}
