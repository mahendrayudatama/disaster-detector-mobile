package com.example.finalprojectgigih.model

data class Properties(
    val created_at: String,
    val disaster_type: String,
    val image_url: String?,
    val partner_code: Any,
    val partner_icon: Any,
    val pkey: String,
    val report_data: ReportData,
    val source: String,
    val status: String,
    val tags: Tags,
    val text: String,
    val title: Any,
    val url: String
)