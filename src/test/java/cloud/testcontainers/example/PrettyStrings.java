package cloud.testcontainers.example;

public class PrettyStrings {

    public static String logo = "                                         /                                      \n" +
            "                                       /////////                                  \n" +
            "                                    ///////////////                               \n" +
            "                                   /////////////////                              \n" +
            "                                      /////////////                               \n" +
            "                                     %%   ////   %                                \n" +
            "                                     %%    //   %%                                \n" +
            "                                   %%      //      %                              \n" +
            "                                 %%        ////      %                            \n" +
            "                                 %     /////////     %                            \n" +
            "                                  % /////////////// %%                            \n" +
            "                                    %%%%%%%%%%%%%%%       \n" +
            "  \n" +
            "    /%%%%%%    /%%                             /%%              /%%%%%                    \n" +
            "   /%%__  %%  | %%                            |__/             |__  %%                    \n" +
            "  | %%  \\ %% /%%%%%%    /%%%%%%  /%%%%%%/%%%%  /%%  /%%%%%%%      | %%  /%%%%%%   /%%%%%% \n" +
            "  | %%%%%%%%|_  %%_/   /%%__  %%| %%_  %%_  %%| %% /%%_____/      | %% |____  %% /%%__  %%\n" +
            "  | %%__  %%  | %%    | %%  \\ %%| %% \\ %% \\ %%| %%| %%       /%%  | %%  /%%%%%%%| %%  \\__/\n" +
            "  | %%  | %%  | %% /%%| %%  | %%| %% | %% | %%| %%| %%      | %%  | %% /%%__  %%| %%      \n" +
            "  | %%  | %%  |  %%%%/|  %%%%%%/| %% | %% | %%| %%|  %%%%%%%|  %%%%%%/|  %%%%%%%| %%      \n" +
            "  |__/  |__/   \\___/   \\______/ |__/ |__/ |__/|__/ \\_______/ \\______/  \\_______/|__/    \n" +
            "  \n" +
            "  \n" +
            "  Congratulations on running your first test! 🎉\n" +
            "  Runtime used: \n" +
            "      ::::::\n" +
            " \n" +
            "  You can now return to the website to complete your onboarding.\n" +
            " \n" +
            " \n" +
            "";

    public static String ohNo = "" +
        " ██████╗ ██╗  ██╗    ███╗   ██╗ ██████╗               ██╗\n" +
        "██╔═══██╗██║  ██║    ████╗  ██║██╔═══██╗    ██╗      ██╔╝\n" +
        "██║   ██║███████║    ██╔██╗ ██║██║   ██║    ╚═╝█████╗██║ \n" +
        "██║   ██║██╔══██║    ██║╚██╗██║██║   ██║    ██╗╚════╝██║ \n" +
        "╚██████╔╝██║  ██║    ██║ ╚████║╚██████╔╝    ╚═╝      ╚██╗\n" +
        " ╚═════╝ ╚═╝  ╚═╝    ╚═╝  ╚═══╝ ╚═════╝               ╚═╝\n" +
        "                                                         ";

    public static String getLogo(String runtimeName) {
        return logo.replaceAll("::::::", runtimeName);
    }
}
