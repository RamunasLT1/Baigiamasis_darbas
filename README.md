# **Automatinio testavimo baigiamasis darbas**

## Internetinio puslapio ["apklausa.lt"](https://apklausa.lt) testavimas

<br></br>

### TS1: Sign in to  ["apklausa.lt"](https://apklausa.lt/users/sign_in) test

### TC1.2 Check Sign-In with valid information
* TC1.1.1. Enter valid e-mail.
* TC1.1.2. Enter valid password.
* TC1.1.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is message: *Prisijungėte sėkmingai.* </u>**
  <br></br>

### TC1.2 Check Sign-In with invalid password
* TC1.2.1. Enter valid e-mail.
* TC1.2.2. Enter invalid password.
* TC1.2.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is message: *Neteisingas el. paštas arba slaptažodis.* </u>**
  <br></br>

### TC1.3 Check Sign-In with invalid e-mail
* TC1.3.1. Enter invalid e-mail.
* TC1.3.2. Enter valid password.
* TC1.3.3. Press button 'Prisijungti'.
  <br></br>
  **<u> Expected result is message: *Invalid El. paštas or password.* </u>**
  <br></br>

### TS2  Poll ["Atšvaitų nešiojimas"](https://apklausa.lt/f/atsvaitu-nesiojimas-4dzmdag/answers/new.html) test

### TC2.1 Poll positive check
* TC2.1.1. Click on 'Vyras' checkBox.
* TC2.1.2. Enter age in age field.
* TC2.1.3. Click on 'Taip' at main question.
* TC2.1.4. Check if text field is enabled.
  <br></br>
  **<u> Expected result is message: *Dėkojame už atsakymą!* </u>**
  <br></br>

### TC2.2. Poll negative check: no answer to main question
* TC2.2.1. Click on 'Vyras' checkBox.
* TC2.2.2. Enter age in age field.
* TC2.2.3. Don't click anything on main question.
* TC2.2.4. Wait for error message to appear.
  <br></br>
  **<u> Expected result is error message: *Rastos klaidos* </u>**
  <br></br>


### TS3  New ["Poll creation"](https://apklausa.lt/private/forms/new?) test

### TC3.1 Poll creation positive test
* TC3.1.1. Sign In.
* TC3.1.2. Click on 'Mano anketos'.
* TC3.1.3. Enter poll name.
* TC3.1.4. Click on 'Sukurti'.
  <br></br>
  **<u> Expected result is message: *Anketa sukurta* </u>**
  <br></br>

### TC3.2 Poll creation negtive test: no title
* TC3.2.1. Sign In.
* TC3.2.2. Click on 'Mano anketos'.
* TC3.2.4. Click on 'Kurti naują anketą'.
* TC3.2.5. Leave poll name field empty
* TC3.2.6. Click on 'Sukurti'
  <br></br>
  **<u> Expected result is error message: *Negali būti tuščias* </u>**
  <br></br>

### TC3.3 Poll creation edit test
* TC3.3.1. Sign In.
* TC3.3.2. Click on 'Mano anketos'.
* TC3.3.3. Click on 'Klausimai'.
* TC3.3.4. Click on 'EiluteTekstoIvedimui'.
* TC3.3.5. Write new question.
* TC3.3.6. Click on 'Išsaugoti'.
  <br></br>
  **<u> Expected result is: *New question appears in poll* </u>**
  <br></br>

### TC3.4 Poll creation delete test
* TC3.4.1. Sign In.
* TC3.4.2. Click on 'Mano anketos'.
* TC3.4.3. Click on 'Šalinti'.
* TC3.4.4. Click on 'OK' in alert box.

  <br></br>
  **<u> Expected result is: *Poll is deleted* </u>**
  <br></br>


  

  



