Feature: image analysis
  SFA input API

  Scenario: call image analysis successfully
    Given prepare token
    When call image analysis input API
    Then image records generate in IR platform.