package com.saas.saas.constant;

public interface AppConstants {
    String APP_NAME = "SaaS CRM Platform";
    String APP_CODE = "CRM_CORE";
    String APP_VERSION = "1.0.0";
    String PLATFORM_TYPE = "MULTI_TENANT";

    String ENV_DEV = "DEV";
    String ENV_STAGE = "STAGE";
    String ENV_PROD = "PROD";

    String DEFAULT_TIME_ZONE = "UTC";
    String DEFAULT_LOCALE = "en_US";

    String DATE_FORMAT = "yyyy-MM-dd";
    String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    String ISO_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    int DEFAULT_PAGE = 0;
    int DEFAULT_PAGE_SIZE = 20;
    int MAX_PAGE_SIZE = 200;
    int MAX_SEARCH_KEYWORD_LENGTH = 100;

    int MAX_LOGIN_ATTEMPTS = 5;
    int PASSWORD_MIN_LENGTH = 8;
    int PASSWORD_MAX_LENGTH = 64;
    int OTP_EXPIRY_MINUTES = 5;

    String REQUEST_ID_HEADER = "X-Request-Id";
    String CORRELATION_ID_HEADER = "X-Correlation-Id";
    String CLIENT_IP_HEADER = "X-Client-IP";

    long MAX_PROFILE_PIC_SIZE_MB = 5;
    long MAX_ATTACHMENT_SIZE_MB = 20;

    int CACHE_DEFAULT_TTL_MINUTES = 30;
    int MAX_BULK_OPERATION_LIMIT = 500;

    boolean ENABLE_AUDIT_LOG = true;
    boolean ENABLE_ACTIVITY_TRACKING = true;
    boolean ENABLE_API_LOGGING = true;

    String DEFAULT_LEAD_SOURCE = "WEBSITE";
    String DEFAULT_LEAD_STATUS = "NEW";
    String DEFAULT_OPPORTUNITY_STAGE = "PROSPECTING";

    String HEALTH_UP = "UP";
    String HEALTH_DOWN = "DOWN";
}
