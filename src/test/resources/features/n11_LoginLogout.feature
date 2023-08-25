@allOfThem
Feature: Login Logout Module Test

    @login
    Scenario: Login Test
      When The user clicks Uye Ol Giris Yap button
      And The user enters e-mail into the E-Posta Adresi section
      And The user enters password into the Sifre section
      And The user clicks the Giris Yap button
      And The user clicks the Hesabim button
      Then The user sees name as Merhaba name

    @logout
    Scenario: Logout Test
      When The user clicks Uye Ol Giris Yap button
      And The user enters e-mail into the E-Posta Adresi section
      And The user enters password into the Sifre section
      And The user clicks the Giris Yap button
      And The user clicks the Hesabim button
      And The user clicks the settings button
      And The user clicks the Cikis Yap button
      And The user clicks the Cikis Yap button again on the confirmation box
      Then The user sees Uye Ol Giris Yap button

    @misLogin
    Scenario Outline: Login With Wrong Credentials
      When The user clicks Uye Ol Giris Yap button
      And The user enters "<e-mail>" into the E-Posta Adresi section
      And The user enters "<password>" into the Sifre section
      And The user clicks the Giris Yap button
      Then The user cannot see the Hesabim



      Examples:
        |         e-mail         | password |
        |                        |          |
        |    abc123@gmail.com    | Aslan1   |
        | sdet.test.23@gmail.com |          |
        |                        | Vaydin71 |