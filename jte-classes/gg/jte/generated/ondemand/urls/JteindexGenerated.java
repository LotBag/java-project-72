package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.urls.UrlsPage;
import hexlet.code.util.NamedRoutes;
import java.time.format.DateTimeFormatter;
public final class JteindexGenerated {
	public static final String JTE_NAME = "urls/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,5,6,6,7,7,8,8,9,9,11,14,14,29,29,31,31,31,33,33,33,33,33,33,33,33,33,33,33,33,35,35,37,37,37,40,40,40,42,42,45,45,47,47,51,51,54,54,54,54,54,54,54,54,54,55,55,55,55,55,55,55,55,57,57,58,58,58,58,58,58,58,58,58,59,59,59,59,59,59,59,59,59,59,59,61,61,62,62,62,62,62,62,62,62,62,63,63,63,63,63,63,63,63,67,67,70,70,70,70,70,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlsPage page) {
		jteOutput.writeContent("\r\n");
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		jteOutput.writeContent("\r\n");
		var pages = page.getPages();
		jteOutput.writeContent("\r\n");
		var currentPage = page.getCurrentPage();
		jteOutput.writeContent("\r\n");
		var urls = page.getUrls();
		jteOutput.writeContent("\r\n");
		var urlChecks = page.getUrlChecks();
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <section>\r\n        <div class=\"container-lg mt-5\">\r\n            <h1>Сайты</h1>\r\n\r\n            <table class=\"table table-bordered table-hover mt-3\">\r\n                <thead>\r\n                <tr>\r\n                    <th class=\"col-1\">ID</th>\r\n                    <th>Имя</th>\r\n                    <th class=\"col-2\">Последняя проверка</th>\r\n                    <th class=\"col-1\">Код ответа</th>\r\n                </tr>\r\n                </thead>\r\n                <tbody>\r\n                ");
				for (var url: urls) {
					jteOutput.writeContent("\r\n                    <tr>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(url.getId());
					jteOutput.writeContent("</td>\r\n                        <td>\r\n                            <a");
					var __jte_html_attribute_0 = NamedRoutes.urlPath(url.getId());
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(url.getName());
					jteOutput.writeContent("</a>\r\n                        </td>\r\n                        ");
					if (urlChecks.containsKey(url.getId())) {
						jteOutput.writeContent("\r\n                            <td>\r\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(urlChecks.get(url.getId()).getCreatedAt().toLocalDateTime().format(formatter));
						jteOutput.writeContent("\r\n                            </td>\r\n                            <td>\r\n                                ");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(urlChecks.get(url.getId()).getStatusCode());
						jteOutput.writeContent("\r\n                            </td>\r\n                        ");
					} else {
						jteOutput.writeContent("\r\n                            <td></td>\r\n                            <td></td>\r\n                        ");
					}
					jteOutput.writeContent("\r\n                    </tr>\r\n                ");
				}
				jteOutput.writeContent("\r\n                </tbody>\r\n            </table>\r\n\r\n            ");
				if (pages.size() > 0) {
					jteOutput.writeContent("\r\n                <nav aria-label=\"Page navigation\">\r\n                    <ul class=\"pagination justify-content-center mt-5\">\r\n                        <li");
					var __jte_html_attribute_1 = "page-item" + (currentPage <= 1 ? " disabled" : "");
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
						jteOutput.writeContent(" class='");
						jteOutput.setContext("li", "class");
						jteOutput.writeUserContent(__jte_html_attribute_1);
						jteOutput.setContext("li", null);
						jteOutput.writeContent("'");
					}
					jteOutput.writeContent(">\r\n                            <a class=\"page-link\" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(NamedRoutes.urlsPath());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("?page=");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(currentPage - 1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">Previous</a>\r\n                        </li>\r\n                        ");
					for (var pageNumber : pages) {
						jteOutput.writeContent("\r\n                            <li");
						var __jte_html_attribute_2 = "page-item" + (currentPage == pageNumber ? " active" : "");
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
							jteOutput.writeContent(" class='");
							jteOutput.setContext("li", "class");
							jteOutput.writeUserContent(__jte_html_attribute_2);
							jteOutput.setContext("li", null);
							jteOutput.writeContent("'");
						}
						jteOutput.writeContent(">\r\n                                <a class=\"page-link\" href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(NamedRoutes.urlsPath());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("?page=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(pageNumber);
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(pageNumber);
						jteOutput.writeContent("</a>\r\n                            </li>\r\n                        ");
					}
					jteOutput.writeContent("\r\n                        <li");
					var __jte_html_attribute_3 = "page-item" + (currentPage >= pages.size() ? " disabled" : "");
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
						jteOutput.writeContent(" class='");
						jteOutput.setContext("li", "class");
						jteOutput.writeUserContent(__jte_html_attribute_3);
						jteOutput.setContext("li", null);
						jteOutput.writeContent("'");
					}
					jteOutput.writeContent(">\r\n                            <a class=\"page-link\" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(NamedRoutes.urlsPath());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("?page=");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(currentPage + 1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">Next</a>\r\n                        </li>\r\n                    </ul>\r\n                </nav>\r\n            ");
				}
				jteOutput.writeContent("\r\n        </div>\r\n    </section>\r\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlsPage page = (UrlsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
