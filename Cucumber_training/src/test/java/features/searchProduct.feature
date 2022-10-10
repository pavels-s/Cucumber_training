Feature: Search and Place products to order

Scenario: Search experience for product search in both home page and offers page

Given User is on GreenCard landing page
When User searched with short name "tom" and extracted actual name of product
Then User searched for same shortname "tom" in offers page
And Validate product name in offers page validates product page in landing page