Feature: Vytrack Home Page Modules visibility.
  User Story: As a user, I should be accessing all the main modules of the app.
  Store and sales managers should view 8 module names:
  Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, and System
  Drivers should view 4 module names: Fleet, Customers, Activities, System

  @manager
  Scenario Outline: For store and sales managers result verification
    Given Manager is on login page
    When Manager enters "<managerUserName>" into Username box and pushes Enter
    And Manager enters "<managerPassword>" into Password box and pushes Enter
    Then Manager see home page with eight modules
    Then Manager logs out
    Examples:
      | managerUserName | managerPassword |
      | storemanager63  | UserUser123     |
      | storemanager64  | UserUser123     |
      | storemanager65  | UserUser123     |
      | storemanager66  | UserUser123     |

  @driver
  Scenario Outline: For drivers result verification
    Given Driver is on login page
    When Driver enters "<driverUserName>" into Username box and pushes Enter
    And Driver enters "<driverPassword>" into Password box
    Then Driver see home page with four modules
    Then Driver logs out
    Examples:
      | driverUserName | driverPassword |
      | user19         | UserUser123    |
      | user20         | UserUser123    |
      | user21         | UserUser123    |
      | user22         | UserUser123    |
      | user23         | UserUser123    |
      | user24         | UserUser123    |