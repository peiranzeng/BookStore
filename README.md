# BookStore
>A online book store based on spring MVC, Hibernate CRUD operation and MySQL database.
## Project Demo
The project are deployed on Heroku, go visit [https://zengbookstore.herokuapp.com/](https://zengbookstore.herokuapp.com/)
## Architecture 
The project are divided int to two part - Bookstore and AdminPortal. Bookstore is the front-end website where customer can 
submit orders while AdminPortal is used for Administration purpose.
## BookStore
### Features
* Authentication:

  * User sign-up and login.

  * User login with username and password.

* Authorization:

  * User need to sign up to make payment and submit orders.

  * User need to sign up to view the order history and view the user profile.

* User Management:

  * User can reset their user name, profile and password in the profile page.

  * User can add and update their payment information and shipping address.

  * User can set their default payment method. 

  * Before login, user can reset their password by enter their email, and the email with link will be sent to the user for password reset.

  * User can update their shopping cart before checkout.

* Email Service:

  * After sign up, the email with the link to user's profile page will be sent out from BookStore.

  * After checking out, the order confirmation email will be sent from BookStore.

## AdminPortal
The AdminProtal is used for admin purpose, where the admin user can manage book information. For the source code go visit 
[https://github.com/peiranzeng/BookStoreAdminPortal](https://github.com/peiranzeng/BookStoreAdminPortal).
### Features
* Authetication:

  * Admin User login.

* Management:

  * Admin User can create, update, and delete the book information.

## Build Tools
### Front-end
* [Bootstrap](https://getbootstrap.com/)
* [Thymeleaf](https://www.thymeleaf.org/)
### Back-end
* [Spring Boot](http://spring.io/projects/spring-boot)
* [Spring Security](https://spring.io/projects/spring-security#overview)
* [Spring Data](https://spring.io/projects/spring-data-jdbc)
### Database
* [MySQL](https://www.mysql.com/cn/)



