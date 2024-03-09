package com.hematmal;

public class App 
{
    public static void main( String[] args )
    {
        ValidationService validationService = new ValidationService();
        // validationService.ValidateAmount();

        AccountAvailability accountAvailability = new AccountAvailability();
        // accountAvailability.AccountAvailable();

        EmailService emailService = new EmailService();
        // emailService.SendEmail();

        SmsService smsService = new SmsService();
        // smsService.SendSms();

        TransactionFacadeService transactionFacadeService = new TransactionFacadeService(accountAvailability, emailService, smsService, validationService);
        transactionFacadeService.SendCredit();
    }
}
