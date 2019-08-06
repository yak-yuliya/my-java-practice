public class Enum_practise {

//        public boolean getButtonStatus(String value) {
//            switch (value) {
//                case "enabled":
//                    return true;
//
//                case "disabled":
//                    return false;
//
//                default:
//                    throw new RuntimeException(String.format("The specified option in feature file: %s is not valid! Please use one of the following options: enabled or disabled", value));
//            }
//        }

        public boolean practiseEnum(String value){
            BUTTON_STATUS_ENUM buttonStatus;

            switch (value) {
                case "enabled":
                    buttonStatus = BUTTON_STATUS_ENUM.ENABLED;
                    break;

                case "disabled":
                    buttonStatus = BUTTON_STATUS_ENUM.DISABLED;
                    break;

                default:
                    throw new RuntimeException(String.format("The specified option in feature file: %s is not valid! Please use one of the following options: enabled or disabled", value));
            }

            return buttonStatus.getButtonStatusValue();
        }

        public enum BUTTON_STATUS_ENUM {
            ENABLED(true), DISABLED(false);

            private final boolean value;

            BUTTON_STATUS_ENUM(boolean isEnabled) {
                this.value = isEnabled;
            }

            public boolean getButtonStatusValue() {
                return value;
            }
        }


//    public class ButtonStatus {
//
//        public static final boolean ENABLED = true;
//        public static final boolean DISABLED = false;
//
//        private boolean buttonStatus;
//
//        public ButtonStatus(String name) {
//            setButtonStatus(name);
//        }
//
//        public boolean getButtonStatus() {
//            return this.buttonStatus;
//        }
//
//        private void setButtonStatus(String value) {
//            switch (value) {
//                case "ENABLED":
//                    this.buttonStatus = ButtonStatus.ENABLED;
//                    break;
//                case "DISABLED":
//                    this.buttonStatus = ButtonStatus.DISABLED;
//                    break;
//                default:
//                    throw new RuntimeException(String.format("The specified option in feature file: %s is not valid! Please use one of the following options: enabled or disabled", value));
//            }
//        }
    }
