package com.saas.saas.constant;

/**
 * Central security contract for CRM SaaS platform.
 * Governs authentication, authorization and session lifecycle.
 */
public interface SecurityConstants {

    /* ─────────── JWT Core ─────────── */
    String TOKEN_PREFIX = "Bearer ";
    String AUTH_HEADER = "Authorization";
    String REFRESH_HEADER = "X-Refresh-Token";

    String JWT_ISSUER = "crm.saas.platform";
    String JWT_AUDIENCE = "crm-users";

    long ACCESS_TOKEN_EXPIRATION_MS = 1000 * 60 * 60;        // 1 hour
    long REFRESH_TOKEN_EXPIRATION_MS = 1000 * 60 * 60 * 24 * 30; // 30 days

    /* ─────────── Password Policy ─────────── */
    int PASSWORD_MIN_LENGTH = 8;
    int PASSWORD_MAX_LENGTH = 64;
    int PASSWORD_EXPIRY_DAYS = 90;

    /* ─────────── Login Security ─────────── */
    int MAX_LOGIN_ATTEMPTS = 5;
    int ACCOUNT_LOCK_MINUTES = 15;

    /* ─────────── OTP / MFA ─────────── */
    int OTP_LENGTH = 6;
    int OTP_EXPIRY_MINUTES = 5;

    /* ─────────── Session & Cookie ─────────── */
    String SESSION_COOKIE_NAME = "CRM_SESSION";
    boolean SECURE_COOKIE = true;
    boolean HTTP_ONLY_COOKIE = true;

    /* ─────────── CORS ─────────── */
    String ALLOWED_ORIGINS = "*";
    String ALLOWED_METHODS = "GET,POST,PUT,DELETE,OPTIONS";

    /* ─────────── Encryption / Hashing ─────────── */
    String PASSWORD_HASH_ALGO = "BCrypt";
    int PASSWORD_HASH_STRENGTH = 12;
}
