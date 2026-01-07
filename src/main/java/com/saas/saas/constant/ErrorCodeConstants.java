package com.saas.saas.constant;

/**
 * Global error code registry for CRM SaaS platform.
 * Format: CRM-<MODULE>-<4 DIGIT CODE>
 */
public interface ErrorCodeConstants {

    /* ─────────── Common / Core (0000–0099) ─────────── */
    String INTERNAL_SERVER_ERROR = "CRM-COM-0001";
    String INVALID_REQUEST = "CRM-COM-0002";
    String RESOURCE_NOT_FOUND = "CRM-COM-0003";
    String ACCESS_DENIED = "CRM-COM-0004";
    String REQUEST_TIMEOUT = "CRM-COM-0005";

    /* ─────────── Authentication / Authorization (0100–0199) ─────────── */
    String INVALID_TOKEN = "CRM-AUTH-0101";
    String TOKEN_EXPIRED = "CRM-AUTH-0102";
    String UNAUTHORIZED = "CRM-AUTH-0103";
    String FORBIDDEN = "CRM-AUTH-0104";
    String OTP_EXPIRED = "CRM-AUTH-0105";

    /* ─────────── User Module (0200–0299) ─────────── */
    String USER_NOT_FOUND = "CRM-USER-0201";
    String USER_ALREADY_EXISTS = "CRM-USER-0202";
    String USER_INACTIVE = "CRM-USER-0203";
    String INVALID_USER_ROLE = "CRM-USER-0204";

    /* ─────────── Tenant / Organization (0300–0399) ─────────── */
    String TENANT_NOT_FOUND = "CRM-TENANT-0301";
    String TENANT_SUSPENDED = "CRM-TENANT-0302";
    String TENANT_EXPIRED = "CRM-TENANT-0303";

    /* ─────────── Subscription / Billing (0400–0499) ─────────── */
    String SUBSCRIPTION_NOT_FOUND = "CRM-SUB-0401";
    String SUBSCRIPTION_EXPIRED = "CRM-SUB-0402";
    String PAYMENT_FAILED = "CRM-SUB-0403";

    /* ─────────── Lead / CRM Core (0500–0599) ─────────── */
    String LEAD_NOT_FOUND = "CRM-LEAD-0501";
    String INVALID_PIPELINE_STAGE = "CRM-LEAD-0502";
    String DUPLICATE_LEAD = "CRM-LEAD-0503";

    /* ─────────── File / Upload (0600–0699) ─────────── */
    String FILE_TOO_LARGE = "CRM-FILE-0601";
    String INVALID_FILE_TYPE = "CRM-FILE-0602";

    /* ─────────── Integration / External (0700–0799) ─────────── */
    String PAYMENT_GATEWAY_ERROR = "CRM-EXT-0701";
    String EMAIL_SERVICE_DOWN = "CRM-EXT-0702";

}
