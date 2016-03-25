 // these can go into a global lib or retask the java-client repo
  public static void moveToElementByXpath(final String xpathLocator)
      throws Exception {
    final WebElement weToMove = new WebDriverWait(driver, 15)
    .until(ExpectedConditions.visibilityOfElementLocated(By
        .xpath(xpathLocator)));
    final Actions builder = new Actions(driver);
    final Actions elementToMove = builder.moveToElement(weToMove);
    elementToMove.perform();
  }

  public static void scrollDown(final String xpathLocator) throws Exception {
    System.out.println("Scrolling down");
    final WebElement output = new WebDriverWait(driver, 15)
    .until(ExpectedConditions.visibilityOfElementLocated(By
        .xpath(xpathLocator)));
    final Locatable hoverItem = (Locatable) output;
    final int y = hoverItem.getCoordinates().onPage().getY();
    ((JavascriptExecutor) driver)
    .executeScript("window.scrollBy(0," + y + ");");
  }

  // constants

  public static void scrollDownBottom() throws TimeoutException,
  IllegalStateException {
    System.out.println("Scrolling down to bottom of page");
    ((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");

  }
