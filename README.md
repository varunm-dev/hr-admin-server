# HR Admin Code Server Challenge Application API
You are the HR admin in your company, and you recently hired a group of employees, and you
want to manage them effectively. Create an application which allows you to see the list of
employees and their details (Name, Email, Phone Number, Website).
When you click on an action on the employee row (pencil icon for edit), you will open a popup
window/modal which allows you to edit the details of the employee and save. When saved, the
updated contents should be visible in the employee table

## Tech Stack
| Technology | Version | Purpose |
| ------ | ------ | ------ |
| Java | 11| Programming Language |
| SpringBoot | 2.4.3 | Application Framework |
| Embedded Tomcat Server | 9 | To Deploy Application |
| Maven |   | Build Tool |
| Swagger OpenApi | 3.0 | API Dcoumentaion and Testing |
| Junit, Mockito | 5 | Unit Test Cases |
| Log4j | 2.1.3 | To maintain Logs |
| yaml |  | To write application Properties info |

we should run this as a java application or spring boot app. the default port number was 8080.

## Rest Apis Info
here we used 2 apis which are to get Employees List and Update Employee
following are the request and responses
 
##### http://localhost:8080/getEmployees
##### Request:
No Request
##### Response:
[
  {
    "id": 1,
    "name": "Leannne Graham",
    "email": "sincere.april.biz",
    "phNumber": "1-77-234-567",
    "website": "www.leannne.april.biz"
  },
  {
    "id": 2,
    "name": "Ervin Howell",
    "email": "shanna@melissa.tv",
    "phNumber": "010-692-6593 x09125",
    "website": "www.anastasia.net"
  }
]

##### http://localhost:8080/updateEmployee
##### Request: updateEmployee
{
  "id": 0,
  "name": "string",
  "email": "string",
  "phNumber": "string",
  "website": "string"
}
##### Response:
[
  {
    "id": 1,
    "name": "Leannne Graham",
    "email": "sincere.april.biz",
    "phNumber": "1-77-234-567",
    "website": "www.leannne.april.biz"
  },
  {
    "id": 2,
    "name": "Ervin Howell",
    "email": "shanna@melissa.tv",
    "phNumber": "010-692-6593 x09125",
    "website": "www.anastasia.net"
  }
]

##### swagger url:
http://localhost:8080/swagger-ui.html

![swagger](https://user-images.githubusercontent.com/83081402/116199241-87100e80-a754-11eb-93cc-fdbd07e59c79.JPG)


```sh
Swagger Api Request for getEmployees
```
![getEmployees](https://user-images.githubusercontent.com/83081402/116199396-b3c42600-a754-11eb-87cd-3ba0e0b7996a.JPG)

```sh
Swagger Api Response for updateEmployee
```
![updateEmployees](https://user-images.githubusercontent.com/83081402/116199437-bfafe800-a754-11eb-8056-9c27ee2ecaaa.JPG)

```sh
Test Cases Results
```
![test-cases](https://user-images.githubusercontent.com/83081402/116199481-c9d1e680-a754-11eb-91a5-5e970b1014ec.JPG)

```sh
Code Coverage
```
![code-coverage](https://user-images.githubusercontent.com/83081402/116199532-da825c80-a754-11eb-9ca3-d190ec747501.JPG)
