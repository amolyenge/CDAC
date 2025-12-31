using Microsoft.AspNetCore.Mvc;

namespace _07_A_ViewBag_ViewData_TempData.Models
{
    public class ErrorViewModel
    {
        public string? RequestId { get; set; }

        public bool ShowRequestId => !string.IsNullOrEmpty(RequestId);
    }
}
