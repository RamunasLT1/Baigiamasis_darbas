# **Automatinio testavimo baigiamasis darbas**

## Internetinio puslapio ["apklausa.lt"](https://apklausa.lt) testavimas

<br></br>

### TS1: Sign in to  ["apklausa.lt"](https://apklausa.lt/users/sign_in) test

### TC1.2 Check Sign-In with valid information

* TC1.1.1. Enter valid e-mail.
* TC1.1.2. Enter valid password.
* TC1.1.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is get message: *Prisijungėte sėkmingai.* </u>**
  <br></br>

### TC1.2 Check Sign-In with invalid password

* TC1.2.1. Enter valid e-mail.
* TC1.2.2. Enter invalid password.
* TC1.2.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is get message: *Neteisingas el. paštas arba slaptažodis.* </u>**
  <br></br>

### TC1.3 Check Sign-In with invalid e-mail

* TC1.3.1. Enter invalid e-mail.
* TC1.3.2. Enter valid password.
* TC1.3.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is get message: *Invalid El. paštas or password.* </u>**
  <br></br>

### TS2  Poll ["Atšvaitų nešiojimas"](https://apklausa.lt/f/atsvaitu-nesiojimas-4dzmdag/answers/new.html) test

### TC2.1 Poll positive check

* TC2.1.1. Click on 'Vyras' checkBox
* TC2.1.2. Enter age in age field
* TC2.1.3. Click on 'Taip' at main question
* TC2.1.4. Check if text field is enabled
  <br></br>
  **<u> Expected result is: *Dėkojame už atsakymą!* </u>**
  <br></br>

### TC2.2. Poll negative check - no answer to main question

* TC2.2.1. Click on 'Vyras' checkBox
* TC2.2.2. Enter age in age field
* TC2.2.3. Don't click anything on main question
  <br></br>
  **<u> Expected result is: *Rastos klaidos* </u>**
  <br></br>




