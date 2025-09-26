# 🍴 Code Storm – Online Food Delivery Application  

Code Storm is a modern **multi-vendor food delivery platform** that connects restaurants with customers. It provides a seamless experience for browsing menus, placing orders, making payments, and managing restaurants — all in one system.  

---

## 🚀 Features  

- Multi-Vendor Support (multiple restaurants can register & manage menus).  
- Role-Based Access (Customers, Restaurant Owners, Super Admin).  
- Favorites, Add/Remove from Cart, Carousel for trending meals.  
- Real-Time Order Updates with email notifications.  
- Secure Payments via Stripe integration.  
- JWT Authentication & Spring Security for robust protection.  
- Password Reset via Email (SMTP).  

---

## 🛠️ Tech Stack  

**Frontend**: React 18, Redux, Tailwind CSS, MUI, React Router DOM  
**Backend**: Spring Boot 3, Spring Security, JWT  
**Database**: MySQL 8.0+  
**Payment**: Stripe API  
**Notifications**: SMTP for emails  

---

Run Backend

=> open in any ide

=> go to application.properties 

for MySql Database configration
-> change db name
-> change db password

for payment gatway
-> give your stripe payment gatway secret key

for sending email
-> give your email
-> give your email app password

howw to generate app password for email -> https://youtu.be/T0Op3Qzz6Ms?si=BOON8ubAHx3fTCLT


Run Frontend 
=> do npmi
=> npm start



Copy code
REACT_APP_API_BASE_URL=http://localhost:8080/api
REACT_APP_STRIPE_PUBLIC_KEY=pk_test_yourStripePublicKey
