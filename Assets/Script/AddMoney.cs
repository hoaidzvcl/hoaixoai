using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class AddMoney : MonoBehaviour
{
    public CarController carController;
    public AudioSource au;
    public AudioClip aumon;
    private int money;
    public UnityEngine.UI.Text txt;
    private void OnTriggerEnter2D(Collider2D collision)
    {
        money += 1;
        txt.text = money.ToString();
        Destroy(gameObject);
        au.PlayOneShot(aumon);
    }
}
