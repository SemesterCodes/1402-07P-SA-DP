package com.hematmal;

public class TransactionFacadeService {
    private AccountAvailability accountAvailability;
    private EmailService emailService;
    private SmsService smsService;
    private ValidationService validationService;

    public TransactionFacadeService(AccountAvailability accountAvailability,
                                    EmailService emailService,
                                    SmsService smsService,
                                    ValidationService validationService) {
                                        this.accountAvailability = accountAvailability;
                                        this.emailService = emailService;
                                        this.smsService = smsService;
                                        this.validationService = validationService;

    }

    public void SendCredit() {
        validationService.ValidateAmount();
        accountAvailability.AccountAvailable();
        emailService.SendEmail();
        smsService.SendSms();
    }
}
