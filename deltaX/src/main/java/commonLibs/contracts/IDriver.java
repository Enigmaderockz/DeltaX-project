package commonLibs.contracts;

public interface IDriver {

	public void navigateToFirstUrl(String url) throws Exception;

	public void closeAllBrowsers() throws Exception;

	public String getCurrentUrl() throws Exception;

}
