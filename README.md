# ZenDesk Homework
## Run the Application
The computer need to install Java 8 environment to run this application. If not, the user can follow the instructions of the link below to install the Java 8 Environment.
```
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
```

User can use command below to excute.
```
java -jar (with path)/ZendeskHomework.jar
```

## Assumptions
1. The requirement mentions the user should be able to search on any field and with exact value matching. But if the type of search term in JSON is a List, this way might not work properly. So I assume once if the List contains the element user entered. This is a valid result. 

2. Search result might have multiple value, because some of research fields is not unique.

3. If the type of search term is **boolean**, User need to type **true** or **false** for matching.

4. If the type of search term is **Date** type, In this problem I treat this like a String. So user needs to type exactly the same String to meet the search requirement.

## User Manual
**1. Choose Search Options**
```
Welcome to Zendesk Search
Type 'quit' to exit at any time, Press 'Enter' to continue
Select search options:
    * Press 1 to search Zendesk
    * Press 2 to View a list of searchable fields
    * Type 'quit' to exit
```
In this scenario, 
> User can press **1** to search things in Zendesk
> User can press **2** to view the User Manual
> User can type **quit** and press **Enter** to quit the application


**2. Contunue Application**

In some snenarios, application perform some actions and meet invalid input. The application shows such description:
```
Press 'Enter' to continue:
```
So user need to press **Enter** to let the application to continue.


**3. Search fields**
After user press **1** to continue search things. User will get the others options.
``` 
Select Search Options:
  * Press 1 to search User
  * Press 2 to search Ticket
  * Press 3 to search Organization
```
User can choose one of them for search for specific things.
##### Sample Run 1
This sample run will shows how to search a User with id of 5.
After press 1 to search things for User,
```
Enter Search Term:
```
Then we need to enter the search term we have for searching, So we type **_id** and press **Enter**.

Then we need to enter the search value,
```
Enter Search Value: 
```
So we enter **5**,

And we will get the output:
```
User{
 _id : 5
 url : http://initech.zendesk.com/api/v2/users/5.json
 external_id : 29c18801-fb42-433d-8674-f37d63e637df
 name : Loraine Pittman
 alias : Mr Ola
 created_at : 2016-06-12T08:49:19 -10:00
 active : true
 verified : false
 shared : false
 locale : zh-CN
 timezone : Monaco
 last_login_at : 2013-07-03T06:59:27 -10:00
 email : olapittman@flotonic.com
 phone : 9805-292-618
 signature : Don't Worry Be Happy!
 organization_id : 101
 tags : [Frizzleburg, Forestburg, Sandston, Delco]
 suspended : false
 role : admin
}
Total 1 Item Found
Press 'Enter' to continue:
```
We can follow the instruction to press **Enter** to continue.


##### Sample Run 2 
This sample run will shows how to search a Organization with **tags** contains **Skinner**.
After press 3  to search things for Organization,
```
Enter Search Term:
```
Then we type **tags** and press **Enter**,
```
Enter Search Value: 
```
then we enter **Skinner** and we will get output:
```
Organization{
 _id : 109
 url : http://initech.zendesk.com/api/v2/organizations/109.json
 external_id : 5f930931-37fd-41a2-9c68-1cd5b99e7a3e
 name : Möreganic
 domain_names : [pearlesex.com, netility.com, rodemco.com, cuizine.com]
 created_at : 2016-06-03T10:50:56 -10:00
 details : MegaCorp
 shared_tickets : false
 tags : [Price, Meyer, Heath, Skinner]
}
Total 1 Item Found
Type 'Enter' to continue:
```


