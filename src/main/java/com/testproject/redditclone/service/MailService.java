package com.testproject.redditclone.service;

import com.testproject.redditclone.model.NotificationEmail;

public interface MailService {

    void sendMail(NotificationEmail notificationEmail);
}
