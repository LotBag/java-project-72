package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.urls.UrlPage;
import hexlet.code.util.NamedRoutes;
import java.time.format.DateTimeFormatter;
public final class JteshowGenerated {
	public static final String JTE_NAME = "urls/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,5,6,6,7,7,9,12,12,15,15,15,21,21,21,25,25,25,29,29,29,35,35,35,35,35,35,35,35,35,49,49,51,51,51,52,52,52,53,53,53,54,54,54,55,55,55,56,56,56,58,58,63,63,63,63,63,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlPage page) {
		jteOutput.writeContent("\r\n");
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		jteOutput.writeContent("\r\n");
		var url = page.getUrl();
		jteOutput.writeContent("\r\n");
		var checks = page.getUrlChecks();
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <section>\r\n        <div class=\"container-lg mt-5\">\r\n            <h1>Сайт ");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(url.getName());
				jteOutput.writeContent("</h1>\r\n\r\n            <table class=\"table table-bordered table-hover mt-3\">\r\n                <tbody>\r\n                <tr>\r\n                    <td>ID</td>\r\n                    <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(url.getId());
				jteOutput.writeContent("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td>Имя</td>\r\n                    <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(url.getName());
				jteOutput.writeContent("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td>Дата создания</td>\r\n                    <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(url.getCreatedAt().toLocalDateTime().format(formatter));
				jteOutput.writeContent("</td>\r\n                </tr>\r\n                </tbody>\r\n            </table>\r\n\r\n            <h2 class=\"mt-5\">Проверки</h2>\r\n            <form method=\"post\"");
				var __jte_html_attribute_0 = NamedRoutes.checksPath(url.getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                <button type=\"submit\" class=\"btn btn-primary\">Запустить проверку</button>\r\n            </form>\r\n\r\n            <table class=\"table table-bordered table-hover mt-3\">\r\n                <thead>\r\n                <th class=\"col-1\">ID</th>\r\n                <th class=\"col-1\">Код ответа</th>\r\n                <th>title</th>\r\n                <th>h1</th>\r\n                <th>description</th>\r\n                <th class=\"col-2\">Дата проверки</th>\r\n                </thead>\r\n                <tbody>\r\n                ");
				for (var check : checks) {
					jteOutput.writeContent("\r\n                    <tr>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getId());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getStatusCode());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getTitle());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getH1());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getDescription());
					jteOutput.writeContent("</td>\r\n                        <td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(check.getCreatedAt().toLocalDateTime().format(formatter));
					jteOutput.writeContent("</td>\r\n                    </tr>\r\n                ");
				}
				jteOutput.writeContent("\r\n                </tbody>\r\n            </table>\r\n        </div>\r\n    </section>\r\n");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlPage page = (UrlPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
