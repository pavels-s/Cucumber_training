Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both home page and offers page

Given User is on GreenCard landing page
When User searched with short name "tom" and extracted actual name of product
Then User searched for same short name "tom" in offers page
And Validate product name on offers page matches product page in landing page