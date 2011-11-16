package net.codjo.notification.gui.plugin;
import net.codjo.notification.common.message.NotificationRequest;
import net.codjo.notification.gui.api.AbstractNotificationHandler;
/**
 * Tache par d�faut affichant les taches non d�finit.
 */
final class DefaultNotificationHandler extends AbstractNotificationHandler {

    DefaultNotificationHandler(NotificationGuiOperations notificationGuiOperations) {
        super(notificationGuiOperations);
    }


    public void handle(NotificationRequest notification) {
        displayNotification("Message du serveur inconnu", notification.toString());
    }
}
